class Main {
  public static void main(String[] args) {
    // int[] nums = { 99, 2, 8, 75, 10, 7, 9, 17, 5, 3, 4, 1, 11, 1 };
    int[] nums = { 99, 2, 8, 75, 10, 7, 9, 17, 5, 3, 4};

    BogoSort bgs = new BogoSort();

    bgs.bogosort(nums);
  }
}