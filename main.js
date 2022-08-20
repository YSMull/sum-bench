let perform = function (n) {
    let s = 0;
    for (let i = 0; i < n; i++) {
        s += i;
    }
    return s
}

let inputs = '10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001'.split('\n');
for (let i = 0; i < inputs.length; i++) {
    let n = Number.parseInt(inputs[i]);
    console.time('sum')
    let result = perform(n)
    console.timeEnd('sum')
    console.log(result);
}
