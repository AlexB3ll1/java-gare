# Java OOP — simulazione gestione gare

**Tipologia:** esercitazione di preparazione all'esame  
**Tecnologia:** Java (progetto Eclipse con `module-info.java`)

## Obiettivo

Esercitarsi nella programmazione orientata agli oggetti implementando gare con regole di ammissione differenti, iscrizione dei partecipanti e gestione del vincitore di una gara agonistica.

## Struttura dei sorgenti

```text
simulazione10/
├── src/
│   ├── module-info.java
│   └── simulazione10/
│       ├── Runner.java
│       ├── Gara.java
│       ├── GaraAgonistica.java
│       ├── GaraNonAgonistica.java
│       ├── CompetizioneAgonistica.java
│       └── RunnerNotValidException.java
├── .project
└── .classpath
```

## Funzionalità presenti

- **Runner:** rappresenta un partecipante con età, miglior tempo e identificativo; verifica la validità dei dati in fase di creazione.
- **Gara (astratta):** gestisce una collezione di partecipanti, l'iscrizione singola o multipla e una ricerca per soglia d'età.
- **GaraAgonistica:** ammette runner sotto una soglia di tempo massimo; implementa la gestione di un vincitore che deve essere iscritto.
- **GaraNonAgonistica:** vincola l'iscrizione a un intervallo di età.
- **CompetizioneAgonistica:** definisce l'interfaccia di gestione del vincitore.
- **RunnerNotValidException:** rappresenta i dati o le operazioni di iscrizione non validi.

## Concetti applicati

Classi astratte, ereditarietà, polimorfismo, interfacce, overriding, eccezioni personalizzate, `LinkedList` e `ArrayList`.

## Compilazione

Richiede un JDK con supporto ai moduli Java (Java 9 o successivo). Dalla cartella `simulazione10/`, con una shell Bash:

```bash
mkdir -p out
javac -d out src/module-info.java src/simulazione10/*.java
```

Il sorgente è organizzato come **insieme di classi riutilizzabili**: non contiene una classe con `public static void main(String[] args)`. Il comando `java ...` per avviare un'applicazione completa non è quindi disponibile finché non si aggiunge una classe dimostrativa o una suite di test.

È possibile anche importare la cartella originale in Eclipse come progetto Java esistente.

## Limiti e miglioramenti possibili

- Mancano test automatici e un punto di ingresso dimostrativo.
- `Runner.equals()` confronta gli identificativi, ma `hashCode()` non è ridefinito: andrebbero mantenuti coerenti.
- La soglia di `getIscrittiClasseEta(int eta)` è implementata con confronto stretto (`>`), da chiarire nella documentazione d'uso.
- Le validazioni e i messaggi di errore potrebbero essere resi più descrittivi.

## Stato

Sorgenti Java compilati con successo durante la revisione; non è stato eseguito un collaudo funzionale completo.
