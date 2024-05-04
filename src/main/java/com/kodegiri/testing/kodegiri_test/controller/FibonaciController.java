package com.kodegiri.testing.kodegiri_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 04/05/24
 * Time: 03.49
 * description: Kodegiri_Test
 */

@RestController
@RequestMapping("api")
public class FibonaciController {

    // ENDPOINT UNTUK FIBONACI
    @GetMapping("/fibonaci")
    public List<Integer> fibonaci(@RequestParam int data){
        // List
        List<Integer> fibonaciList = new ArrayList<>();
        int prev = 0;
        int current = 1;
        int count = 0;

        while (count < data){
            // MENGAMBIL DATA YANG BUKAN GENAP / GANJIL !=0
            if (current % 2 != 0){
                // MENAMBAHKAN DATA KE CURRENT
                fibonaciList.add(current);
                // COUNT DITAMBAHKAN
                count++;
            }
            int next = prev + current;
            prev = current;
            current = next;
        }
        return fibonaciList;
    }


    // ENDPOINT UNTUK KATA TERPANJANG
    @GetMapping("/kata-terpanjang")
    public int kataTerpanjang(@RequestParam String data){
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = data;

        int m = s1.length();
        int n = s2.length();

        int[][] x = new int[m + 1][n + 1];
        int result = 0;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    x[i][j] = 0;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    x[i][j] = x[i - 1][j - 1] + 1;
                    result = Integer.max(result, x[i][j]);
                } else
                    x[i][j] = 0;
            }
        }

        return result;
    }
}
