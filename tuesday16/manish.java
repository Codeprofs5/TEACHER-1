class duplicate {
    public static void msin(String args[]) {
        int nums={1,1,1,2,2,3,4,5,6,6,6,6,7}
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            
            nums[count] = nums[i];
            count++;
        }
        System.out.println(count); 
    }
}

