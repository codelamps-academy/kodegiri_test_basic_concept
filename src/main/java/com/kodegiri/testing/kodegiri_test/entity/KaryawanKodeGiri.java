package com.kodegiri.testing.kodegiri_test.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 04/05/24
 * Time: 17.45
 * description: Kodegiri_Test
 */


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "karyawan")
public class KaryawanKodeGiri {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "fullname is not null")
    private String fullname;

    @NotNull(message = "alamat is not null")
    private String alamat;

    private String phone;
}
