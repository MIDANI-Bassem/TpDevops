package com.example.tpdevops;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {


        private String nom ;

        private String prenom;

        private String fonction;


}
