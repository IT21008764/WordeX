Wordex - A Dyslexia Screening and Remediation Platform
Wordex is a mobile application designed to screen, identify, and provide targeted interventions for children aged 8-10 with dyslexia. It incorporates machine learning techniques to detect specific dyslexia types and offers interactive, syllabus-aligned activities to improve reading, writing, and spelling skills.

Table of Contents
About the Project
Features
Technologies Used
System Architecture
Installation
Usage
Team
License
About the Project
Dyslexia is a common learning difficulty that affects reading, writing, and spelling. Wordex focuses on providing:

Early screening for the risk of dyslexia.
Personalized and engaging exercises to help children improve their skills.
Continuous progress tracking for parents and educators.
The project addresses the specific needs of primary school students and supports multiple languages: English, Sinhala, and Tamil.

Features
Dyslexia Screening: Detects four main types of dyslexia:
Letter Jumbling Dyslexia
Whole Word Jumbling Dyslexia
Spelling Word Dyslexia
Read Aloud Confusion Dyslexia
Interactive Exercises: Activities tailored to individual needs, aligned with school syllabi.
Progress Tracking: Generate reports to monitor a child’s improvement.
Multi-language Support: English, Sinhala, and Tamil fonts.
Technologies Used
Backend: Spring Boot
Machine Learning: TensorFlow (Supervised Learning, Random Forest Algorithm)
Languages: Java, Python
Other Tools: Medically-approved datasets for model training and evaluation.
System Architecture
The system consists of the following components:

Data Collection and Preprocessing: Medically approved question papers distributed to students, followed by data labeling.
ML Model Development: Random Forest-based detection model with a training accuracy of 97.62%.
Mobile App UI: User-friendly design enabling easy interaction for children, parents, and educators.
