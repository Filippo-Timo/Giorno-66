package filippotimo;

public class Application {

    public static void main(String[] args) {

        /*
         * Esercizio 1)
         *
         * SELECT * FROM clienti WHERE nome = 'Mario'
         *
         *
         * Esercizio 2)
         *
         * SELECT nome, cognome FROM clienti WHERE anno_di_nascita = 1982
         *
         *
         * Esercizio 3)
         *
         * SELECT COUNT (*) FROM fatture WHERE iva = 20
         *
         *
         * Esercizio 4)
         *
         * SELECT (*) FROM prodotti WHERE extract(year from data_attivazione) = 2017 AND (in_produzione = true OR in_commercio = true)
         *
         *
         * Esercizio 5)
         *
         * SELECT * FROM fatture
         * JOIN clienti ON fatture.id_cliente = clienti.numero_cliente
         * WHERE importo < 1000
         *
         *
         *  Esercizio 6)
         *
         *
         * SELECT numero_fattura,importo,iva,data_fattura,denominazione FROM fatture
         * JOIN fornitori USING (numero_fornitore)
         *
         *
         *  Esercizio 7)
         *
         * SELECT
         * EXTRACT(YEAR FROM data_fattura) AS anno,
         * COUNT (*) AS numero_fatture
         * FROM fatture
         * WHERE iva=20
         * GROUP BY EXTRACT(YEAR FROM data_fattura)
         * ORDER BY anno;
         *
         *
         * Esercizio 8)
         *
         * SELECT
         * EXTRACT(YEAR FROM data_fattura) AS anno,
         * COUNT (*) AS numero_fatture,
         * SUM(importo) AS somma_totale
         * FROM fatture
         * GROUP BY EXTRACT(YEAR FROM data_fattura)
         * ORDER BY anno;
         *
         *
         *  */

    }
}
