package com.codegym.formater;


//import com.codegym.model.Province;
//import com.codegym.service.ProvinceService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.format.Formatter;
//import org.springframework.stereotype.Component;
//
//import java.text.ParseException;
//import java.util.Locale;
//import java.util.Optional;
//
//@Component
//public class ProvinceFormatter implements Formatter<Optional<Province>> {
//
//    private ProvinceService provinceService;
//
//    @Autowired
//    public ProvinceFormatter(ProvinceService provinceService) {
//        this.provinceService = provinceService;
//    }
//
//    @Override
//    public Optional<Province> parse(String text, Locale locale) throws ParseException {
//        return provinceService.findById(Long.parseLong(text));
//    }
//
//    @Override
//    public String print(Optional<Province> object, Locale locale) {
//        return "[" + object.get().getId() + ", " +object.get().getName() + "]";
//    }
//}