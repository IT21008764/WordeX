
# **Wordex - A Dyslexia Screening and Remediation Platform**

Wordex is a mobile application designed to screen, identify, and provide targeted interventions for children aged 8-10 with dyslexia. It incorporates machine learning techniques to detect specific dyslexia types and offers interactive, syllabus-aligned activities to improve reading, writing, and spelling skills.
![image](https://github.com/user-attachments/assets/1ce5abe4-0798-460b-bf42-dd9976e5d85a)


## **Table of Contents**
- [About the Project](#about-the-project)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [System Architecture](#system-architecture)
- [Installation](#installation)
- [Usage](#usage)
- [Team](#team)
- [License](#license)

---

## **About the Project**
Dyslexia is a common learning difficulty that affects reading, writing, and spelling. Wordex focuses on providing:
- Early screening for the risk of dyslexia.
- Personalized and engaging exercises to help children improve their skills.
- Continuous progress tracking for parents and educators.

The project addresses the specific needs of primary school students and supports multiple languages: **English**, **Sinhala**, and **Tamil**.

---

## **Features**
1. **Dyslexia Screening**: Detects four main types of dyslexia:
   - Letter Jumbling Dyslexia
   - Whole Word Jumbling Dyslexia
   - Spelling Word Dyslexia
   - Read Aloud Confusion Dyslexia
2. **Interactive Exercises**: Activities tailored to individual needs, aligned with school syllabi.
3. **Progress Tracking**: Generate reports to monitor a child’s improvement.
4. **Multi-language Support**: English, Sinhala, and Tamil fonts.

---

## **Technologies Used**
- **Backend**: Spring Boot
- **Machine Learning**: TensorFlow (Supervised Learning, Random Forest Algorithm)
- **Languages**: Java, Python
- **Other Tools**: Medically-approved datasets for model training and evaluation.
  ![image](https://github.com/user-attachments/assets/5bf67e18-f393-42bc-9bf9-e27f5c2821dc)


---

## **System Architecture**
The system consists of the following components:
1. **Data Collection and Preprocessing**: Medically approved question papers distributed to students, followed by data labeling.
2. **ML Model Development**: Random Forest-based detection model with a training accuracy of **97.62%**.
3. **Mobile App UI**: User-friendly design enabling easy interaction for children, parents, and educators.
   ![image](https://github.com/user-attachments/assets/e880c4e0-3e03-40f8-a2c0-421ceb6cce93)


---

## **Installation**
Follow these steps to set up and run the project:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/wordex.git
   cd wordex
   ```
2. Install dependencies for the backend:
   ```bash
   cd backend
   mvn install
   ```
3. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
4. Set up the TensorFlow model:
   ```bash
   cd ml-model
   python train_model.py
   ```
5. Launch the mobile app on an emulator or device.

---

## **Usage**
1. **Screen for Dyslexia**:
   - Log in as a parent, teacher, or administrator.
   - Perform a dyslexia screening test for the student.
2. **Interactive Learning**:
   - Access personalized activities based on the test results.
   - Track the child’s progress through the app.
3. **Report Generation**:
   - Generate detailed reports for parents and educators.

---

## **Team**
- **Supervisor**: Prof. Samantha Thelijjagoda  
- **Co-Supervisor**: Ms. Poojani Gunathilake  
- **External Supervisor**: Ms. Kalpani Abeysinghe  

### **Group Members**
- **Hansamal G.P.S.**: Focus on Letter Jumbling Dyslexia  
- **Dissanayake D.M.O.W.**: Focus on Whole Word Jumbling Dyslexia  
- **Samarakoon S.M.S.C.**: Focus on Spelling Word Dyslexia  
- **Madushan J.G.N.**: Focus on Read Aloud Confusion Dyslexia  

---

## **License**
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## **Acknowledgements**
- External Supervisors: Dr. Shamini Dissanayake and others.
- Inspiration: Research and tools for addressing learning disabilities.
- References: Various academic and practical resources cited in the presentation.

---
