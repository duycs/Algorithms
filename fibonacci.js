//example
console.log('Fibonacci');
console.log('Input: ', 10);
console.log('Output: ', fibonacci(10));

function fibonacci(num) {
  if (num <= 1) return 1;

  return fibonacci(num - 1) + fibonacci(num - 2);
}