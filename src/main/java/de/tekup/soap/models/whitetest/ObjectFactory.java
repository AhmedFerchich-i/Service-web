

package de.tekup.soap.models.whitetest;

import javax.xml.bind.annotation.XmlRegistry;



@XmlRegistry
public class ObjectFactory {


    public ObjectFactory() {
    }

    
    public StudentRequest createStudentRequest() {
        return new StudentRequest();
    }

    
    public WhiteTestResponse createWhiteTestResponse() {
        return new WhiteTestResponse();
    }

   
    public Student createStudent() {
        return new Student();
    }

    
    public Exam createExam() {
        return new Exam();
    }

}
