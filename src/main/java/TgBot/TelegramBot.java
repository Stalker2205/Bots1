package TgBot ;

import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.GetFile;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;


public class TelegramBot extends TelegramLongPollingBot {


    private Class<PhotoSize> photoSizeClass;

    @Override
    public void onUpdateReceived(Update update) {
        String chatID = update.getMessage().getChatId().toString();

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatID);

        // Создаем клавиуатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

//        SendPhoto photo1 = new SendPhoto();
//        Message message = update.getMessage();
//        InputFile inputs = new InputFile();

//        if (message.hasPhoto())
//        {
//            System.out.println("photo");
//
//            List<PhotoSize> photos = message.getPhoto();
//            PhotoSize photo = photos.get(photos.size()-1);
//                GetFile getFile = new GetFile();
//                getFile.setFileId(photo.getFileId());
//                System.out.println(getFile.getFileId().toString());
//
//                URL url;
//                URL url2;
//
//                try {
//                    url = new URL("https://api.telegram.org/bot"+ Info.Token +"/getFile?file_id="+getFile.getFileId().toString());
//                    BufferedReader buf = new BufferedReader(new InputStreamReader(url.openStream()));
//                    String Fileresponce = buf.readLine();
//
//                    JSONObject jresult = new JSONObject(Fileresponce);
//                    JSONObject path = jresult.getJSONObject("result");
//
//                    String PhotoPath = path.getString("file_path");
//                    Long FileSize = path.getLong("file_size");
//                    String FuniqueID = path.getString("file_unique_id");
//
//
//                    System.out.println(PhotoPath);
//                    buf.close();
//
//                    url2 = new URL("https://api.telegram.org/file/bot"+Info.Token+"/"+PhotoPath);
//                    BufferedReader buf1 = new BufferedReader(new InputStreamReader(url2.openStream()));
//                    //String stg = "https://api.telegram.org/file/bot"+Info.Token+"/"+PhotoPath;
//
//                    File file = new File(getFile.getFileId().toString(),FuniqueID,FileSize,"https://api.telegram.org/file/bot"+Info.Token+"/"+PhotoPath);
//
//                    inputs.setMedia(new java.io.File("https://api.telegram.org/file/bot"+Info.Token+"/"+PhotoPath));
//
//
//
//
//                    // inputs.setMedia(new File("https://api.telegram.org/file/bot"+Info.Token+"//"+PhotoPath));
//
//                    System.out.println("Для Json -https://api.telegram.org/bot"+ Info.Token +"/getFile?file_id="+getFile.getFileId().toString());
//                System.out.println("путь к фотке -" + url.getPath());
//                System.out.println("сслыка на скачку - https://api.telegram.org/file/bot"+Info.Token+"/"+PhotoPath);
//
//                photo1.setChatId(chatID);
//                photo1.setPhoto(inputs);
//
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//
//                SendPhoto nf = new SendPhoto();
//               InputFile photo32 = new InputFile();
//
//        }
//        else
//        {
//            System.out.println("noPhoto");
//        }
//        System.out.println("не зашел");

//        System.out.println("не зашел");
     String Text = update.getMessage().getText();
switch (Text)
        {

            case "/start":
                replyKeyboardMarkup.setKeyboard(keyboard.keyboardRows(Text));
                sendMessage.setText("Dratyti!");
                break;

            case "/help":
                replyKeyboardMarkup.setKeyboard(keyboard.keyboardRows(Text));
                sendMessage.setText("Dasvidannia!");
                break;
            case "/Дати 5":
                replyKeyboardMarkup.setKeyboard(keyboard.keyboardRows(Text));
                sendMessage.setText("Nati 5!");
                break;

            default:
                replyKeyboardMarkup.setKeyboard(keyboard.keyboardRows(Text));
                sendMessage.setText("Возвращаю мой господина!");
            break;
        }















        try {
           // this.execute(photo1);
            this.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public String getBotToken() {

        return Info.Token;
    }
    @Override
    public String getBotUsername() {
        return Info.BotName;
    }
}
