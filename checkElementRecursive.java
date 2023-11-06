 class CheckElementRecursive {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int key = 3;
        boolean found = isKeyFound(a, 0, key); // Store the result in a boolean variable

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }

    public static boolean isKeyFound(int[] a, int i, int key) {
        if (i < a.length) {
            if (a[i] == key)
                return true;
            else
                return isKeyFound(a, i + 1, key); // Return the result of the recursive call
        }
        return false;
    }
}
