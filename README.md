Overview

Watt Diary is a simple web-based application that helps users calculate their daily electricity usage based on the number of hours different devices are used.

It provides:

Device-wise energy consumption
Total energy usage (in kWh)
A visual bar chart representation
Features
 Clean and minimal UI
 Predefined household devices
 Automatic energy calculation using backend API
 Visual graph of electricity usage
 Uses Local Storage for result handling
 Tech Stack
Frontend
HTML
CSS
JavaScript
Backend
Spring Boot (running on localhost:8080)
📂 Project Structure
📁 Watt-Diary
├── index.html        # Landing page
├── device.html       # Device input page
├── result.html       # Results & graph page
├── style.css         # Styling
⚙️ How It Works
User starts from index.html
Navigates to device input page
Enters number of hours for each device
Data is sent to backend API
Backend calculates energy consumption
Results are displayed with total + chart
 Data Flow
User Input → device.html → API (Spring Boot)
          → Calculation → result.html → Display + Graph
