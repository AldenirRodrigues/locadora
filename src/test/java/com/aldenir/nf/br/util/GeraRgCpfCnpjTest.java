package com.aldenir.nf.br.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GeraRgCpfCnpjTest {
    GeraRgCpfCnpj geraRgCpfCnpj = new GeraRgCpfCnpj();

    @Test
    void testCpf() {
        String result = geraRgCpfCnpj.cpf(true);
        Assertions.assertNotEquals("818.775.701-92", result);
    }

    @Test
    void testCnpj() {
        String result = geraRgCpfCnpj.cnpj(true);
        Assertions.assertNotEquals("67583545000149", result);
    }

    @Test
    void testRg() {
        String result = geraRgCpfCnpj.rg(true);
        Assertions.assertNotEquals("89.949.824-0", result);
    }

    @Test
    void testIsCPF() {
        boolean result = geraRgCpfCnpj.isCPF("245.861.770-04");
        Assertions.assertTrue(result);
    }

    @Test
    void testIsCNPJ() {
        boolean result = geraRgCpfCnpj.isCNPJ("67583545000149");
        Assertions.assertTrue( result);
    }

    @Test
    void testImprimeCNPJ() {
        String result = GeraRgCpfCnpj.imprimeCNPJ("67583545000149");
        Assertions.assertEquals("67.583.545.0001-49", result);
    }
}
