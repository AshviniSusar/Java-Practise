package JavaBasics;

public class oddeven {
	public static void main(String args[]) {
	int num = 7;

	if (num % 2 == 0) {
	    System.out.println("The number is even.");
	} else {
	    System.out.println("The number is odd.");
	}

}
}


/*
int num = 7;

if (num % 2 == 0) {
    System.out.println("The number is even.");
} else {
    System.out.println("The number is odd.");
}
```

**Explanation:**

In this code, we are checking whether the given number `num` is even or odd. The code uses the modulo operator (`%`), which calculates the remainder when `num` is divided by `2`. If the remainder is `0`, it means the number is divisible by `2` and therefore even. If the remainder is not `0`, it means the number is not divisible by `2` and thus odd.

Here's how the code works step by step for the value `num = 7`:

1. `num % 2` calculates the remainder of `7` divided by `2`, which is `1`.
2. Since the remainder is not `0`, the condition in the `if` statement (`num % 2 == 0`) is `false`.
3. As a result, the code inside the `else` block is executed.
4. The output will be: "The number is odd."

If you were to change the value of `num` to an even number, such as `num = 8`, then the condition would evaluate to `true`, and the output would be "The number is even."

In summary, this code snippet demonstrates how to determine whether a number is even or odd using an `if-else` statement and the modulo operator.
*/