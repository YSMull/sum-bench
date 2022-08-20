use std::time::Instant;

fn perform(n: i32) -> i64 {
    let mut s: i64 = 0;
    let mut i: i64 = 0;
    while i < n as i64 {
        s += i;
        i += 1;
    }
    return s
}

fn main() {
    let input = "10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001";
    let split = input.split("\n");
    split.for_each(|s| {
        let n = s.parse::<i32>().unwrap();
        let start = Instant::now();
        let s = perform(n);
        let duration = start.elapsed();
        println!("{}", s);
        println!("Time elapsed in expensive_function() is: {:?}", duration);
    });
}
