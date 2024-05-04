package com.kodegiri.testing.kodegiri_test.controller;

import com.kodegiri.testing.kodegiri_test.entity.KaryawanKodeGiri;
import com.kodegiri.testing.kodegiri_test.repository.KaryawanRepository;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 04/05/24
 * Time: 18.49
 * description: Kodegiri_Test
 */

@RestController
@RequestMapping("/api/karyawan")
@Data
public class KaryawanController {

    @Autowired
    private KaryawanRepository karyawanRepository;

    @GetMapping
    public List<KaryawanKodeGiri> getAllEmployees(){
        return karyawanRepository.findAll();
    }

    @GetMapping("/{id}")
    public KaryawanKodeGiri getById(@PathVariable Long id){
        return karyawanRepository.getById(id);
    }

    @PostMapping
    public KaryawanKodeGiri addEmployee(@RequestBody KaryawanKodeGiri karyawan){
        return karyawanRepository.save(karyawan);
    }


}
