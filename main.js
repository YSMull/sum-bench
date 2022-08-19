let a = 0;
console.time('sum')
for (let i = 0; i < 10000000; i++) {
    a += i;
}
console.log(a);
console.timeEnd('sum')