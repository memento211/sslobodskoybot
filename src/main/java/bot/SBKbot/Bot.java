package bot.SBKbot;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

public class Bot extends TelegramLongPollingBot{
	
	/**
     * Метод для приема сообщений.
     * @param update Содержит сообщение от пользователя.
     */

    @Override
    public void onUpdateReceived(Update update) {
	String message = update.getMessage().getText();
	
	switch(message) {
	
	case("демики"):
		sendMsgDemiki(update.getMessage().getChatId().toString(), message);
		break;
	case("Демики"):
		sendMsgDemiki(update.getMessage().getChatId().toString(), message);
		break;
	case("24г"):
		sendMsgDemiki(update.getMessage().getChatId().toString(), message);
		break;
	case("владики"):
		sendMsgVladiki(update.getMessage().getChatId().toString(), message);
		break;
	case("Владики"):
		sendMsgVladiki(update.getMessage().getChatId().toString(), message);
		break;
	case("Inf"):
		sendMsgInf(update.getMessage().getChatId().toString(), message);
		break;
	case("inf"):
		sendMsgInf(update.getMessage().getChatId().toString(), message);
		break;
	}
    }
/**
     * Метод для настройки сообщения и его отправки.
     * @param chatId id чата
     * @param s Строка, которую необходимот отправить в качестве сообщения.
     */

    public synchronized void sendMsgDemiki(String chatId, String s) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText("24г,приём... @Plumpla @NastasiaMolotkova");
        try {
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
        	e.printStackTrace();
        }
        
    }
    public synchronized void sendMsgVladiki(String chatId, String s) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText("AGHTUNGH @ZhekaRoyzman @TolyaOdessit");
        try {
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
        	e.printStackTrace();
        }
    }
    public synchronized void sendMsgInf(String chatId, String s) {
    	 InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
         InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
         InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
         InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
         InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
         InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
         InlineKeyboardButton inlineKeyboardButton6 = new InlineKeyboardButton();
         InlineKeyboardButton inlineKeyboardButton7 = new InlineKeyboardButton();
         InlineKeyboardButton inlineKeyboardButton8 = new InlineKeyboardButton();
         InlineKeyboardButton inlineKeyboardButton9 = new InlineKeyboardButton();
         
         inlineKeyboardButton1.setText("Игра дня");
         inlineKeyboardButton1.setCallbackData("1");
         inlineKeyboardButton2.setText("Игра недели");
         inlineKeyboardButton2.setCallbackData("2");
         inlineKeyboardButton3.setText("Игра месяца");
         inlineKeyboardButton3.setCallbackData("3");
         inlineKeyboardButton4.setText("Слив дня");
         inlineKeyboardButton4.setCallbackData("4");
         inlineKeyboardButton5.setText("Слив недели");
         inlineKeyboardButton5.setCallbackData("5");
         inlineKeyboardButton6.setText("Слив месяца");
         inlineKeyboardButton6.setCallbackData("6");
         inlineKeyboardButton7.setText("ban");
         inlineKeyboardButton7.setCallbackData("7");
         inlineKeyboardButton8.setText("Razrab");
         inlineKeyboardButton8.setCallbackData("8");
         inlineKeyboardButton9.setText("MoreInf");
         inlineKeyboardButton9.setCallbackData("9");
         
         List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
         List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
         List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
         
         keyboardButtonsRow1.add(inlineKeyboardButton1);
         keyboardButtonsRow1.add(inlineKeyboardButton2);
         keyboardButtonsRow1.add(inlineKeyboardButton3);
         
         keyboardButtonsRow2.add(inlineKeyboardButton4);
         keyboardButtonsRow2.add(inlineKeyboardButton5);
         keyboardButtonsRow2.add(inlineKeyboardButton6);
         
         keyboardButtonsRow3.add(inlineKeyboardButton7);
         keyboardButtonsRow3.add(inlineKeyboardButton8);
         keyboardButtonsRow3.add(inlineKeyboardButton9);
         
         List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
         rowList.add(keyboardButtonsRow1);
         rowList.add(keyboardButtonsRow2);
         rowList.add(keyboardButtonsRow3);
         inlineKeyboardMarkup.setKeyboard(rowList);
         
    	 SendMessage message = new SendMessage().setChatId(chatId).setText("qq").setReplyMarkup(inlineKeyboardMarkup);

        message.enableMarkdown(true);
        message.setChatId(chatId);
        message.setText("SBK BOT INFO");
        try {
            sendMessage(message);
        } catch (TelegramApiException e) {
        	e.printStackTrace();
        }
    }

/**
     * Метод возвращает имя бота, указанное при регистрации.
     * @return имя бота
     */

    @Override
    public String getBotUsername() {
        return "asdzxc_bot";
    }

    
/**
     * Метод возвращает token бота для связи с сервером Telegram
     * @return token для бота
     */

    @Override
    public String getBotToken() {
        return "1326504042:AAGzsn0EMa6R8uVPUBo3xnBwpAhZELlrdGU";
    }
  
    
	
}
