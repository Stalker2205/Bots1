package TgBot;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.util.ArrayList;
import java.util.List;

public class keyboard {
    public static List<KeyboardRow> keyboardRows (String Com)
    {
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow FirstRow = new KeyboardRow();
        switch (Com)
        {
//            case "/start":
//                keyboardRows.clear();
//                FirstRow.add(new KeyboardButton("/start"));
//                FirstRow.add(new KeyboardButton("/help"));
//                FirstRow.add(new KeyboardButton("/Дати 5"));
//                keyboardRows.add(FirstRow);
//                break;
            case "/help":
                keyboardRows.clear();
                FirstRow.add(new KeyboardButton("/help"));
                FirstRow.add(new KeyboardButton("/start"));
                keyboardRows.add(FirstRow);
                break;
            case "/Дати 5":
                keyboardRows.clear();
                FirstRow.add(new KeyboardButton("Назад"));
                keyboardRows.add(FirstRow);
                break;
            default:
                keyboardRows.clear();
                FirstRow.add(new KeyboardButton("/start"));
                FirstRow.add(new KeyboardButton("/help"));
                FirstRow.add(new KeyboardButton("/Дати 5"));
                keyboardRows.add(FirstRow);
                break;

        }

        return keyboardRows;
    }








}
