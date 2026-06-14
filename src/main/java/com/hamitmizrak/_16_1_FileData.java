package com.hamitmizrak;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.IOException;

/*
Ders türleri, derse geçme, valdiaiton, array, file,exception
*/
public class _16_1_FileData {

    // Ders türleri
    enum CourseType {
        JAVA, SPRING_BOOT, REACT, DATABASE
    }

    // Öğrenci Geçti,Kaldı
    enum StudentStatus {
        PASSED, FAILED
    }

    // Custome Exception
    // inner class
    static class StudentValidationException extends Exception {
        public StudentValidationException(String message) {
            super(message);
        }
    }

    // Student
    @Getter
    @Setter
    @NoArgsConstructor
    @ToString
    static class Student {

        // Field
        private String name;
        private String surname;
        private String emailAddress;
        private int score;
        private CourseType courseType;
        private StudentStatus status;

        // parametreli constructor
        public Student(String name, String surname, String emailAddress, int score, CourseType courseType) {
            this.name = name;
            this.surname = surname;
            this.emailAddress = emailAddress;
            this.score = score;
            this.courseType = courseType;
        }

        // Validation
        private static void validateEmailAddress(String emailAddress) throws StudentValidationException {
            if (emailAddress == null) {
                throw new StudentValidationException("Öğrenci mail adresi null olamaz");
            }
            if (emailAddress.trim().isEmpty()) {
                throw new StudentValidationException("Öğrenci mail adresi boş olamaz");
            }

            if (emailAddress.length() < 2) {
                throw new StudentValidationException("Öğrenci mail adresi en az 2 karakter olmalı");
            }
        } //end validateSurname

        private static void validateScore(int score) throws StudentValidationException {
            if (score < 0 || score > 100) {
                throw new StudentValidationException("Öğrenci notu 0 ile 100 arasında olmalıdır.");
            }
        } //end validateScore

        private static void validateCourseType(CourseType courseType) throws StudentValidationException {
            if (courseType == null) {
                throw new StudentValidationException("Ders türü boş olamaz.");
            }
        } //end validateCourseType

        /// ///////////////////////////////////
        /// Calculate
        private static StudentStatus calculateStatus(int score) {
            if (score >= 50)
                return StudentStatus.PASSED;
            else
                return StudentStatus.FAILED;
        } //end validateCourseType

        // Format
        public String toFileFormat() {
            return name + ";" + surname + ";" + courseType + ";" + status;
        }

        //
        public static Student fromFileLine(String line) throws StudentValidationException {
            if (line == null || line.trim().isEmpty()) {
                throw new StudentValidationException("Satır boş olamaz");
            }

            //  name;surname;emailAddress;not;ders;durum
            String[] parts = line.split(";");
            if(parts.length!=6){
                throw new StudentValidationException("Satır formatı hatalı, Beklenen:name;surname;emailAddress;not;ders;durum ");
            }

            // String name, String surname, String emailAddress, int score, CourseType courseType
            String name =parts[0].trim();
            String surname =parts[1].trim();
            String emailAddress =parts[2].trim();

            // Score
            int score=0;
            try {
                //int score = Integer.valueOf(parts[3]) ;
                 score = Integer.parseInt(parts[3].trim()) ;
            }catch (NumberFormatException numberFormatException){
                throw new StudentValidationException("Not bilgisi sayısal olmalıdır ancak gelen değer:  "+parts[3]);
            }

            // CourseType
            CourseType courseType1;
            try {
                courseType1 = CourseType.valueOf(parts[4].trim());
            }catch (IllegalArgumentException illegalArgumentException){
                throw new StudentValidationException("ders türü enum içinde bulunmalı gelen değer: "+parts[4]);
            }

            // Status
            StudentStatus studentStatus;
            try {
                studentStatus = StudentStatus.valueOf(parts[5].trim());
            }catch (IllegalArgumentException illegalArgumentException){
                throw new StudentValidationException("öğrenci durumu türü enum içinde bulunmalı gelen değer: "+parts[5]);
            }

            // instance
            // String name, String surname, String emailAddress, int score, CourseType courseType
            Student student = new Student(name,surname,emailAddress,score,courseType1);

            if(student.getStatus() !=studentStatus){
                throw new StudentValidationException("Dosyadaki  durum ile hesaplanan durum uyuşmuyor Dosyadaki: "+ studentStatus+", Hesaplanan"+ student.getStatus());
            }

            return student;
        }

        // fileWriter
        public static void dataFileWriter(String fileName, Student[] students) throws IOException{
            if(fileName==null || fileName.trim().isEmpty()){
                throw new IOException("Dosya adı boş olamaz");
            }

            if(students==null){
                throw new IOException("Öğrenci array null  olamaz");
            }




        }


        // fileReader

    }
}
