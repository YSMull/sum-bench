use std::time::Instant;

fn main() {
    let start = Instant::now();
    let mut s: i64 = 1;
    let mut i = 0;
    while i < 10000001 {
        s += i;
        i += 1;
    }
    println!("{}", s);
    let duration = start.elapsed();
    println!("Time elapsed in expensive_function() is: {:?}", duration);
}

