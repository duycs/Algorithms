//example
var arr = [10, -10, 1, 3, 2, 0, 5, -5];
console.log('Selection sort');
console.log('Array befor sorting: ', arr);
console.log('Array after sorting: ', selectionSort(arr));

function selectionSort (unsortedArray) {
  if (unsortedArray.length <= 1) {
    return unsortedArray;
  }

  for (let i = 0; i < unsortedArray.length; i++) {
    let minIndex = i;
    for (let j = i + 1; j < unsortedArray.length; j++) {
      if (unsortedArray[j] < unsortedArray[minIndex]) {
        minIndex = j;
      }
    }
    
    //ES6 Swap
    [unsortedArray[i], unsortedArray[minIndex]] = [unsortedArray[minIndex], unsortedArray[i]]; 
  }

  return unsortedArray;
}