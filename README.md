# Algorithms-Sedgewick
Based on Algorithms, 4th Edition, Robert Sedgewick and Kevin Wayne, learn a broad variety of algorithms and data structures.

## BinarySearch
```cmd
java -cp build/classes/java/main org.pomog.algo.BinarySearch src/main/resources/data/tinyW.txt < src/main/resources/data/tinyT.txt
```

```java
public static int indexOf(int[] a, int key) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
        // Key is in a[lo..hi] or not present.
        int mid = lo + (hi - lo) / 2;
        if      (key < a[mid]) hi = mid - 1;
        else if (key > a[mid]) lo = mid + 1;
        else return mid;
    }
    return -1;
}
```

```Go
func indexOf(arr []int, key int) int {
    lo, hi := 0, len(arr)-1

    for lo <= hi {
        mid := lo + (hi-lo)/2

        if key < arr[mid] {
            hi = mid - 1
        } else if key > arr[mid] {
            lo = mid + 1
        } else {
            return mid
        }
    }
    return -1
}
```

```javascript
function indexOf(arr, key) {
    let lo = 0;
    let hi = arr.length - 1;

    while (lo <= hi) {
        const mid = lo + Math.floor((hi - lo) / 2);

        if (key < arr[mid]) {
            hi = mid - 1;
        } else if (key > arr[mid]) {
            lo = mid + 1;
        } else {
            return mid;
        }
    }
    return -1;
}
```