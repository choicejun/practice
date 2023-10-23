package newo;

import com.github.openai.api.*;

class Main {
  public static void main(String[] args) {
    String apiKey = "YOUR API KEY HERE";
    String prompt = "The quick brown fox jumps over the lazy dog.";
    int maxTokens = 1024;
    float temperature = 0.5f;

    CompletionRequest request = new CompletionRequest.Builder(apiKey, prompt)
        .maxTokens(maxTokens)
        .temperature(temperature)
        .build();

    CompletionResponse response = Completion.create(request);
    String message = response.getChoices().get(0).getText();
    System.out.println(message);
  }
}

