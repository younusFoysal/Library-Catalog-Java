Scenario: Consider you have been asked to develop a generic library catalog in Java that can store and manage different types of library items.  

You are tasked with utilizing generic classes and methods to ensure flexibility and code reusability. 

Requirements: 


Generic Catalog Class: 
a. Implement a generic catalog class that can store information about library items (e.g., books, DVDs, magazines). 

b. Ensure that the catalog works seamlessly with different types of items by using generics. 


Library Item Class: 
a. Create a generic LibraryItem class with attributes such as title, author, and itemID 

b. Ensure that the LibraryItem class is compatible with the generic catalog. 


Library Operations: 
a. Develop methods within the generic catalog to add a new library item, remove an item, and retrieve item details. 

b. Implement error handling to manage scenarios such as attempting to remove a non-existent item. 


User Interface: 
a. Create a simple command-line interface for users to interact with the library catalog. 

b. Allow users to add a new library item, remove an item, and view the current catalog. 


Testing: 
a. Implement comprehensive testing for your generic catalog and LibraryItem class. 

b. Test scenarios should include adding and removing items, ensuring the catalog works with various types of library items. 

###  Output
```

Library Catalog Menu:
1. Add Item
2. Remove Item
3. View Item Details 
4. Display All Items 
5. Exit
Enter your choice: 1
Enter title: Learn Java
Enter author: K.Sky
Enter item ID: B002
Item added: LibraryItem{title='Learn Java', author='K.Sky', itemID='B002'}

Library Catalog Menu:
1. Add Item
2. Remove Item
3. View Item Details
4. Display All Items 
5. Exit
Enter your choice: 4
Catalog Contents:
LibraryItem{title='Harry Potter', author='J.K. Rowling', itemID='B001'} 
LibraryItem{title='Learn Java', author='K.Sky', itemID='B002'}

Library Catalog Menu:
1. Add Item
2. Remove Item
3. View Item Details
4. Display All Items 
5. Exit
Enter your choice: 2
Enter item ID to remove: B002
Item removed: LibraryItem{title='Learn Java', author='K.Sky', itemID='B002'}

Library Catalog Menu:
1. Add Item
2. Remove Item
3. View Item Details
4. Display All Items 
5. Exit
Enter your choice: 4
Catalog Contents:
LibraryItem{title='Harry Potter', author='J.K. Rowling', itemID='B001'}
```

Guidelines
Utilize generic classes and methods to create a flexible and reusable library catalog. 
Focus on code modularity and reusability by using generics effectively. 
Implement exception handling to manage unexpected scenarios gracefully. 
Provide clear and concise comments and documentation for your code. 



Deliverables
1. Java Program Source Code:  


Submit a well documented source code.
Implement generic classes and methods for creating generic library catalog.

2. Output Screenshot:  


Provide a screenshot of the program's output.



Grading Criteria
Your assignment will be evaluated based on the following criteria:  

Implementation of Generic Class: Implement a generic catalog class that can store information about library items. Ensure seamless compatibility with different types of items using generics. 
Implementation of Generic Methods: Create a generic LibraryItem class with attributes such as title, author, and itemID. Ensure compatibility with the generic catalog. 
Library operations: Develop methods in the generic catalog to add a new library item, remove an item, and retrieve item details. 
Error Handling: Implement error handling to manage scenarios such as attempting to remove a non-existent item. Errors should be handled gracefully with clear messages. 
Logic and Computation. 
Program Flow and Structure. 
Output. 
Code style and readability. 
