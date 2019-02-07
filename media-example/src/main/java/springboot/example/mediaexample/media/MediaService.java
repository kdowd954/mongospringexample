package springboot.example.mediaexample.media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MediaService {

    @Autowired
    private MediaRepository mediaRepository;

    public List<Media> getAllMedia() {
        List<Media> media = new ArrayList<>();
        mediaRepository.findAll().forEach(media::add);
        return media;
    }

    public void addMedia(Media media) {
        mediaRepository.save(media);
    }

    public Optional<Media> getMedia(String uuid) {
        return mediaRepository.findById(uuid);
    }

    public void deleteMedia(String uuid) {
        mediaRepository.deleteById(uuid);
    }
}
