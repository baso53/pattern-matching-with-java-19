package comsysto.talks.demojava;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RequestMapping("test-controller")
@RestController
class TestController {

  @PostMapping
  Object createManifest(@RequestBody TestRequest request) {
    return switch (request) {
      case WithInteger s -> s.intValue();
      case WithString s -> s.stringValue();
      case WithComplexType(ComplexType(var x, var y)) -> x + y;
      case WithGenericType<?>(Integer x) -> x * 1000;
      case WithGenericType<?>(String x) -> x.toUpperCase();
      case WithGenericType<?>(var x) -> x;
    };
  }

  @PostMapping("with-list")
  Object createManifestWithList(@RequestBody List<TestRequest> request) {
    return request
        .stream()
        .flatMap(req -> Stream.ofNullable(req instanceof WithInteger i ? i : null))
        .map(WithInteger::intValue)
        .toList();
  }
}