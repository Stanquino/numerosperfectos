package com.example.perfecto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/numeros")

public class NumerosPerfect extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter st = response.getWriter();
        String num1 = request.getParameter("n1");

        int np1 = Integer.parseInt(num1);

        st.println("EL NUMERO QUE INGRESO ES EL" + np1);

        for (int i = 1; i <= np1; i++) {
            if (np1 % i == np1 ) {
                st.println("SU NUMERO ES PERFECTO");
            }
            else
            {
                st.println("SU NUMERO no ES PERFECTO");
            }



        }
    }}
