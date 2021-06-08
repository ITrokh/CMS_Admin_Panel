package com.kpi.web.systems.lab3.statics;

import com.kpi.web.systems.lab3.entity.enums.Language;

public class StaticFieldsUtils {

    public static String getSuccessfulPageCreationText(Language language) {
        return Language.UA.equals(language)
                ? "Сторінка була успішно збережена"
                : "Page was successfully saved";
    }

    public static String getSuccessfulPageUpdateText(Language language) {
        return Language.UA.equals(language)
                ? "Сторінка була успішно оновлена"
                : "Page was successfully updated";
    }

    public static String getSuccessfulPageDeletionText(Language language) {
        return Language.UA.equals(language)
                ? "Сторінка була успішно видалена"
                : "Page was successfully deleted";
    }

    public static String getAdminPanelRootPageHeader(Language language) {
        return Language.UA.equals(language)
                ? "Рут-сторінка"
                : "Root page";
    }

    public static String getAdminPanelPageHeaderTemplate(Language language) {
        return Language.UA.equals(language)
                ? "Сторінки, що доступні із %s"
                : "Pages available from %s";
    }

    public static String getTitleEnText(Language language) {
        return Language.UA.equals(language)
                ? "Заголовок (АНГ)"
                : "Title (EN)";
    }

    public static String getTitleUaText(Language language) {
        return Language.UA.equals(language)
                ? "Заголовок (УКР)"
                : "Title (UA)";
    }

    public static String getCodeText(Language language) {
        return Language.UA.equals(language)
                ? "Код"
                : "Code";
    }

    public static String getContentEnText(Language language) {
        return Language.UA.equals(language)
                ? "Контент (АНГ)"
                : "Content (EN)";
    }

    public static String getContentUaText(Language language) {
        return Language.UA.equals(language)
                ? "Контент (УКР)"
                : "Content (UA)";
    }

    public static String getCreationDateText(Language language) {
        return Language.UA.equals(language)
                ? "Дата створення"
                : "Creation date";
    }

    public static String getImageUrlText(Language language) {
        return Language.UA.equals(language)
                ? "Url картинки"
                : "Image url";
    }

    public static String getDescriptionEnText(Language language) {
        return Language.UA.equals(language)
                ? "Опис (АНГ)"
                : "Description (EN)";
    }

    public static String getDescriptionUaText(Language language) {
        return Language.UA.equals(language)
                ? "Опис (УКР)"
                : "Description (UA)";
    }

    public static String getOrderNumText(Language language) {
        return Language.UA.equals(language)
                ? "Порядок"
                : "Order";
    }

    public static String getOrderTypeText(Language language) {
        return Language.UA.equals(language)
                ? "Тип сортування"
                : "Order type";
    }

    public static String getUpdateDateText(Language language) {
        return Language.UA.equals(language)
                ? "Дата оновлення"
                : "Update date";
    }

    public static String getAliasPageText(Language language) {
        return Language.UA.equals(language)
                ? "Псевдонім для"
                : "Alias of";
    }

    public static String getParentCodeText(Language language) {
        return Language.UA.equals(language)
                ? "Батьківський код"
                : "Parent code";
    }

    public static String getShowButtonText(Language language) {
        return Language.UA.equals(language)
                ? "Переглянути"
                : "Show";
    }

    public static String getUpdateButtonText(Language language) {
        return Language.UA.equals(language)
                ? "Оновити"
                : "Update";
    }

    public static String getDeleteButtonText(Language language) {
        return Language.UA.equals(language)
                ? "Видалити"
                : "Delete";
    }

    public static String getCreateButtonText(Language language) {
        return Language.UA.equals(language)
                ? "+ Створити"
                : "+ Create";
    }

    public static String getHeaderText(Language language) {
        return Language.UA.equals(language)
                ? "Лаб 3 - Адмін-панель CMS - Розробка інтелектуальних Web-систем"
                : "Lab 3 - CMS Admin panel - Development of Intelligent Web Systems";
    }

    public static String getFooterSignText(Language language) {
        return Language.UA.equals(language)
                ? "Виконав Трохименко Іван, студент групи ІП-03мн"
                : "Made by Ivan Trokhymenko, student of IP-03mn";
    }

    public static String getFooterCopyrightsText(Language language) {
        return Language.UA.equals(language)
                ? "(c) Всі права знаходяться під охороною."
                : "(c) All rights reserved.";
    }

    public static String getOpenText(Language language) {
        return Language.UA.equals(language)
                ? "Перейти →"
                : "Open →";
    }

    public static String getOpenTextShortened() {
        return ">";
    }
}
