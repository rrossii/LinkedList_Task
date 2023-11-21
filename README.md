# Task

A brief guide on how to complete this task:
- First, I recommend implementing the `size()` method. Firstly, **create a variable** to store the number of elements in the list and **then return this variable** from the method.
- In the `size()` method, perform the same manipulations as we did for the `display` method, but instead of printing to the screen, increment the created variable.
- In the `delete()` method, you should take the `index` as a parameter. It is crucial not to forget to **check the validity of the index**.
- If `index == 0`, simply redirect the link like `head = head.next`.
- Next, perform operations with the `for` loop to find the desired index of the element.
- Once the required element is found, perform the following operation: `node.next = node.next.next;`
- This way, you will remove the reference to the deleted element, effectively deleting it from the list.

Once you finish the task, you can run the `main` method, where some tests are provided for you.

Additionally, you can run the unit tests located in the `test` folder to validate your solution.
