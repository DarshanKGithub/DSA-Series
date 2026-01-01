function rotate(nums, k) {
    const n = nums.length;
    k = k % n;   // handle large k

    for (let step = 0; step < k; step++) {
        let last = nums[n - 1];

        for (let i = n - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }

        nums[0] = last;
    }
    return nums;
}

// Example
console.log(rotate([1,2,3,4,5,6,7], 3));
