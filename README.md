# 🍃 Spring Boot Learning Path

Questo repository documenta il mio percorso di apprendimento con **Java Spring Boot**. Contiene un progetto creato durante lo studio del framework e lo sviluppo di API RESTful.

## Tecnologie Utilizzate

* **Linguaggio:** [Java](https://www.java.com/)
* **Framework Principale:** [Spring Boot](https://spring.io/projects/spring-boot)
* **Gestore delle Dipendenze:** Maven (tramite Maven Wrapper `mvnw`)
* **Containerizzazione:** [Docker](https://www.docker.com/) & Docker Compose (per la gestione facilitata dei servizi esterni come i database)
* **Test API:** HTTP Client (`requests.http`)

## Struttura del Progetto

Il progetto ha una struttura standard basata su Maven per Spring Boot:

* `src/` - Contiene tutto il codice sorgente Java e i file di configurazione (`application.properties` o `application.yml`).
* `docker-compose.yml` - File per avviare rapidamente servizi accessori necessari all'applicazione (es. database PostgreSQL, MySQL, Redis, ecc.).
* `pom.xml` - Descrittore del progetto e delle sue dipendenze Maven.
* `requests.http` - File contenente le chiamate HTTP pronte per testare direttamente le API dell'applicazione dall'IDE.
* `mvnw` / `mvnw.cmd` - Script del Maven Wrapper per eseguire build senza aver pre-installato Maven globalmente.

## Prerequisiti

Per eseguire questo progetto localmente, assicurati di avere installato:

* **Java Development Kit (JDK):** Versione 17 o superiore (a seconda della configurazione nel `pom.xml`).
* **Docker & Docker Compose:** Se il progetto necessita di un database locale tramite il file `docker-compose.yml`.

## Come Eseguire il Progetto

1. **Clona il repository:**
   ```bash
   git clone [https://github.com/ironsakit/spring-boot.git](https://github.com/ironsakit/spring-boot.git)
   cd spring-boot
   ```

2. **Avvia i servizi esterni (se presenti):**
   Se nel file `docker-compose.yml` è configurato un database o un altro servizio, avvialo in background con:
   ```bash
   docker-compose up -d
   ```

3. **Esegui l'applicazione Spring Boot:**
   Sfrutta il Maven Wrapper incluso per compilare ed eseguire il progetto:
   * Su **Linux/macOS**:
     ```bash
     ./mvnw spring-boot:run
     ```
   * Su **Windows**:
     ```cmd
     mvnw.cmd spring-boot:run
     ```

## Testare le API

All'interno del repository è presente un file `requests.http`. 
Se utilizzi un IDE come **IntelliJ IDEA** o estensioni come **REST Client per VS Code**, puoi aprire questo file ed eseguire direttamente le richieste HTTP documentate per testare gli endpoint.

---
