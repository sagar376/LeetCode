class FoodRatings {
    
    class Food{
        int rating;
        String foodname;
        String cuisine;
        Food(int rating,String foodname,String cuisine)
        {
            this.rating=rating;
            this.foodname=foodname;
            this.cuisine=cuisine;
        }
    }
    //<Cuisine,PriorityQueue<Food>>
    Map<String,PriorityQueue<Food>> cuisineMap=new HashMap<>(); // get pq from cuisine name
    // <Foodname,Food>
    Map<String,Food> menu=new HashMap<>(); // get Food(object) using Food name
    

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i=0;i<foods.length;i++)
        {
            Food foodObject=new Food(ratings[i],foods[i],cuisines[i]);
            //create max heap on basis of the rating
            cuisineMap.putIfAbsent(cuisines[i],new PriorityQueue<>((a,b)->b.rating==a.rating? a.foodname.compareTo(b.foodname) : b.rating-a.rating));
            
            PriorityQueue<Food> pq=cuisineMap.get(cuisines[i]);
            pq.add(foodObject);
            menu.put(foods[i],foodObject);       
        }
        
    }
    
    public void changeRating(String food, int newRating) {
        Food curr=menu.get(food);
        PriorityQueue<Food> pq=cuisineMap.get(curr.cuisine);
        pq.remove(curr);
        curr.rating=newRating;
        pq.add(curr);
        
    }
    
    public String highestRated(String cuisine) {
        return cuisineMap.get(cuisine).peek().foodname;
        
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */