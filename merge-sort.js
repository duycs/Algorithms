//example
var arr = [10, -10, 1, 3, 2, 0, 5, -5];
console.log('Merge sort');
console.log('Array befor sorting: ', arr);
console.log('Array after sorting: ', mergeSort(arr));


//methods
//merge sort method
function mergeSort (unsortedArray) {
  //if the array only has one element or empty
  if (unsortedArray.length <= 1) {
    return unsortedArray;
  }
  //figure out the middle
  const middle = Math.floor(unsortedArray.length / 2);

  //dividing the array into left and right
  const left = unsortedArray.slice(0, middle);
  const right = unsortedArray.slice(middle);

  //recursion to combine the left and right
  return merge(
    mergeSort(left), mergeSort(right)
  );
}

//sub method, merge the two arrays left and right
function merge (left, right) {
  let resultArray = [], leftIndex = 0, rightIndex = 0;

  //concatenate values into the resultArray in order
  while (leftIndex < left.length && rightIndex < right.length) {
    if (left[leftIndex] < right[rightIndex]) {
      resultArray.push(left[leftIndex]);
      leftIndex++; // move left array cursor
    } else {
      resultArray.push(right[rightIndex]);
			rightIndex++; // move right array cursor
    }
  }

  // concat two array after loop
  return resultArray
          .concat(left.slice(leftIndex))
          .concat(right.slice(rightIndex));
}