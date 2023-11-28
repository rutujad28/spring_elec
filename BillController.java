package com.example.electricitybillcalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BillController {

    @PostMapping("/calculate")
    public String calculateBill(BillForm billForm, Model model) {
        // Get the units from the form
        int units = billForm.getUnits();

        // Calculate the bill amount using the specified logic
        double billAmount = calculateBillAmount(units);

        // Set the result in the model
        model.addAttribute("result", "Total Bill Amount: Rs. " + billAmount);

        return "result"; // Thymeleaf template for the result page
    }

    private double calculateBillAmount(int units) {
        double totalBill = 0.0;

        if (units <= 50) {
            totalBill = units * 3.50;
        } else if (units <= 150) {
            totalBill = 50 * 3.50 + (units - 50) * 4.00;
        } else if (units <= 250) {
            totalBill = 50 * 3.50 + 100 * 4.00 + (units - 150) * 5.20;
        } else {
            totalBill = 50 * 3.50 + 100 * 4.00 + 100 * 5.20 + (units - 250) * 6.50;
        }

        return totalBill;
    }
}