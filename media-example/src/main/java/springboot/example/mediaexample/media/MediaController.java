package springboot.example.mediaexample.media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MediaController {

    @Autowired MediaService mediaService;

    @RequestMapping("/media")
    public List<Media> getAllMedia() {
       return mediaService.getAllMedia();
    }

    @RequestMapping("/media/{uuid}")
    public Optional<Media> getMedia(@PathVariable String uuid) {
        return mediaService.getMedia(uuid);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/media")
    public void addTopic(@RequestBody Media media) {
        mediaService.addMedia(media);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/media/{uuid}")
    public void deleteTopic(@PathVariable String uuid) {
        mediaService.deleteMedia(uuid);
    }
}
