# Inefficient Kotlin Filter

This repository demonstrates a common, yet subtle, performance issue in Kotlin involving the overuse of the `filter` function on the same list.  While the code functions correctly, it is not optimized for efficiency.

The example showcases filtering a list for even and odd numbers separately, then combining the results. This approach leads to redundant iterations over the list. The solution provides a more efficient way to achieve the same result.