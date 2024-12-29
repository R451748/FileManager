File -Vista

File-Vista is a console-based Java application that provides users with essential file management capabilities, such as listing files, creating directories, and deleting files or directories. This project showcases the use of event-driven architecture, object-oriented programming principles, and a text-based user interface to deliver a robust and modular system.

Features
1. File Operations:
List Files: Displays all files and directories within a specified directory.
Create Directory: Allows users to create a new directory at the specified path.
Delete Files/Directories: Enables the deletion of specified files or directories.

2. Event-Driven Design:
Modular and extensible architecture, allowing for the seamless addition of new functionalities.
Components communicate using event handlers, ensuring clean separation between logic and user interface.

3. User-Friendly Interface:
Text-based interface guides users through available operations with clear instructions.
Error messages provide feedback for invalid paths or failed operations.

How It Works
User Interaction:
The application starts with a menu presenting the available file operations (list, create, delete, exit).
Users select an option by entering the corresponding number and provide any necessary paths as input.

File Operations:
The program validates the input path and performs the selected operation (list files, create directory, or delete).
Success or error messages are displayed based on the operation outcome.

Dynamic Interaction:
Input paths are dynamically processed, enabling real-time operations on various file systems.
Invalid operations (e.g., non-existent directories) are gracefully handled with informative feedback.

Technologies Used:
Programming Language: Java
Architecture: Event-driven design for modularity and scalability
Interface: Console-based text interface for ease of use and efficiency
