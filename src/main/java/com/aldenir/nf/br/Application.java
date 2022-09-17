package com.aldenir.nf.br;


import com.aldenir.nf.br.util.GeraRgCpfCnpj;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        GeraRgCpfCnpj gerador = new GeraRgCpfCnpj();
        String cpf = gerador.cpf(true);
        System.out.printf("CPF: %s, Valido: %s\n", cpf, gerador.isCPF(cpf));

        String cnpj = GeraRgCpfCnpj.imprimeCNPJ(gerador.cnpj(false));
        System.out.printf("CNPJ: %s, Valido: %s\n", cnpj, gerador.isCNPJ(cnpj));

        String rg = gerador.rg(true);
        System.out.printf("RG: %s", rg);

    }


}
