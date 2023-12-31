package lk.ijse.gdse.d24_hostel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    private String studentId;
    private String name;
    private String address;
    private String contact;
    private Date dob;
    private String gender;
}
