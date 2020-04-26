import java.util.List;
import java.io.IOException;

public class ChunkLoader implements Runnable {
    // ... Anda boleh menambahkan atribut
    private Chunk chunk;
    private String chunkDataFilename;

    public ChunkLoader(Chunk chunk, String chunkDataFilename) {
        // ... Isilah constructor sesuai kebutuhan
        this.chunk = chunk;
        this.chunkDataFilename = chunkDataFilename;
    }

    @Override
    public void run() {
        // Membaca file dengan nama chunkDataFilename
        // Gunakan class CSVReader.
        // Contoh file chunkDataFilename:
        // x,y
        // 1,18
        // 10,8
        // 6,12
        // Untuk setiap x dan y, tambahkan tree ke Chunk
        // Jika ada IOException pada saat membaca reader, catch Exception
        // tidak ada tree yang ditambahkan pada Chunk (tidak dithrow lagi)
        CSVReader Reader = new CSVReader(this.chunkDataFilename, ",");
        List<String[]> result;
        try {
            result = Reader.read();
        } catch (IOException e) {
            return;
        }
        for (String[] STR : result) {
            int x = Integer.parseInt(STR[0]);
            int y = Integer.parseInt(STR[1]);
            this.chunk.addTree(new Position(x, y));
        }
    }
}