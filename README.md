# Binary Search Frequency Tree 
This project was a part of my problem-solving with algorithms university module.
##Description
This is a non-verbose input-driven java program for maintaining a binary search tree (BST) of integer elements (negative, zero or positive). The speciality of your BST is that it records the frequency of occurrence for each integer element in it.

## Actions provisioned on the BST
When the program is running, a user will be able to select one of the following actions to be performed on the BST. If the action requires input it shoud be typed after a space of a line break.

**1** Insert an element into the BST.

**2** Search for an element in the BST.

**3** Find the maximum element from the BST.

**4** Find the minimum element from the BST.

**5** Print the elements in the BST in preorder.

**6** Print the elements in the BST in postorder.

**7** Print the elements in the BST in inorder.

**8** Delete an element.

**0** Will exit the program.

**Anything else will be ignored**


##Printing an elements
###Searching
An element from the BST will always be printed along with its frequency. For example, if there is a node in the BST that contains the element −7, and its frequency is presently recorded as 2, the data in the node will be printed as
−7(2)

If the element (say 122) is not present in the BST, that will be reported as having the frequency 0. The output
will look as follows.
122(0)
###Maximum and minimum elements
If the tree is empty, in both cases, the program will print 0(0). Otherwise, the program will print the maximum and minimum elements from the tree. 

###Preorder, postorder and inorder traversals
Each element will be printed followed by its frequency respective to the chosen traversal order.

