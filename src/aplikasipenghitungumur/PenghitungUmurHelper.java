/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasipenghitungumur;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Acer
 */
public class PenghitungUmurHelper {
   // Menghitung umur secara detail (tahun, bulan, hari)
public String hitungUmurDetail(LocalDate lahir, LocalDate sekarang) {
Period period = Period.between(lahir, sekarang);
return period.getYears() + " tahun, " + period.getMonths() + " bulan, " + period.getDays() + " hari";
}

// Menghitung hari ulang tahun berikutnya
public LocalDate hariUlangTahunBerikutnya(LocalDate lahir, LocalDate
sekarang) {
LocalDate ulangTahunBerikutnya =
lahir.withYear(sekarang.getYear());
if (!ulangTahunBerikutnya.isAfter(sekarang)) {
ulangTahunBerikutnya = ulangTahunBerikutnya.plusYears(1);
}
return ulangTahunBerikutnya;
}

// Menerjemahkan teks hari ke bahasa Indonesia
public String getDayOfWeekInIndonesian(LocalDate date) {
    return switch (date.getDayOfWeek()) {
        case MONDAY -> "Senin";
        case TUESDAY -> "Selasa";
        case WEDNESDAY -> "Rabu";
        case THURSDAY -> "Kamis";
        case FRIDAY -> "Jumat";
        case SATURDAY -> "Sabtu";
        case SUNDAY -> "Minggu";
        default -> "";
    };
}
}
