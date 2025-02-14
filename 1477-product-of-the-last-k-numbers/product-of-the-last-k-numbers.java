class ProductOfNumbers {

    ArrayList<Integer> stream;
    public ProductOfNumbers() {
        stream = new ArrayList<>();    
    }
    
    public void add(int num) {
        stream.add(num);
    }
    
    public int getProduct(int k) {
        int temp = 1, n = stream.size() - 1;
        while(k > 0){
            temp *= stream.get(n);
            n --;
            k --;
        }
        return temp;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */