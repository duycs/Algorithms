//example
var arr = [10, -10, 1, 3, 2, 0, 5, -5];
console.log('Bubble sort');
console.log('Array befor sorting: ', arr);
console.log('Array after sorting: ', bubleSort(arr));

function bubleSort(unsortedArray) {
  var origValues = unsortedArray.slice();
  var length = origValues.length - 1;
  do {
    var swapped = false;
    for(var i = 0; i < length; ++i) {
      if (origValues[i] > origValues[i+1]) {
        //swap
        // var temp = origValues[i];
        // origValues[i] = origValues[i+1];
        // origValues[i+1] = temp;
      
        //ES6 Swap
        [origValues[i], origValues[i+1]] = [origValues[i+1], origValues[i]]; 
        swapped = true;
      }
    }
  }
  while(swapped === true);
  return origValues
}