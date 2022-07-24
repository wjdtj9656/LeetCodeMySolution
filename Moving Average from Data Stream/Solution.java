class MovingAverage {
    Queue<Integer> window;
    int maxSize;
    double sum = 0.0;
    public MovingAverage(int size) {
        this.window = new ArrayDeque<>(maxSize+1);
        this.maxSize = size;
    }
    
    public double next(int val) {
        window.add(val);
        sum += val;
        if(window.size() > maxSize){
          sum -= window.poll();
        }
      return sum / window.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */