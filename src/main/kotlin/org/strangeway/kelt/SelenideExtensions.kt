/*
 * Copyright (c) 2020 Yuriy Artamonov.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

@file:Suppress("DuplicatedCode")

package org.strangeway.kelt

import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.Selectors.*
import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideDriver
import com.codeborne.selenide.SelenideElement
import org.intellij.lang.annotations.Language

/**
 * Creates Selenide element with the passed selector.
 */
fun elt(
    @Language("JQuery-CSS") css: String? = null,
    @Language("XPath") xpath: String? = null,
    @Language("selenium-id") id: String? = null,
    @Language("selenium-name") name: String? = null,
    @Language("selenium-class") cssClass: String? = null,
    @Language("selenium-html-tag") tag: String? = null,
    linkText: String? = null,
    partialLinkText: String? = null,
    text: String? = null,
    textContains: String? = null,
    title: String? = null,
    value: String? = null
): SelenideElement {
    return when {
        css != null -> Selenide.element(css)
        xpath != null -> Selenide.element(byXpath(xpath))
        id != null -> Selenide.element(byId(id))
        name != null -> Selenide.element(byName(name))
        cssClass != null -> Selenide.element(byClassName(cssClass))
        tag != null -> Selenide.element(byTagName(tag))
        linkText != null -> Selenide.element(byLinkText(linkText))
        partialLinkText != null -> Selenide.element(byPartialLinkText(partialLinkText))
        text != null -> Selenide.element(byText(text))
        textContains != null -> Selenide.element(withText(textContains))
        title != null -> Selenide.element(byTitle(title))
        value != null -> Selenide.element(byValue(value))
        else -> throw IllegalArgumentException("Incorrect selector parameters")
    }
}

/**
 * Creates Selenide element with the passed selector.
 */
fun SelenideElement.elt(
    @Language("JQuery-CSS") css: String? = null,
    @Language("XPath") xpath: String? = null,
    @Language("selenium-id") id: String? = null,
    @Language("selenium-name") name: String? = null,
    @Language("selenium-class") cssClass: String? = null,
    @Language("selenium-html-tag") tag: String? = null,
    linkText: String? = null,
    partialLinkText: String? = null,
    text: String? = null,
    textContains: String? = null,
    title: String? = null,
    value: String? = null
): SelenideElement {
    return when {
        css != null -> this.find(css)
        xpath != null -> this.find(byXpath(xpath))
        id != null -> this.find(byId(id))
        name != null -> this.find(byName(name))
        cssClass != null -> this.find(byClassName(cssClass))
        tag != null -> this.find(byTagName(tag))
        linkText != null -> this.find(byLinkText(linkText))
        partialLinkText != null -> this.find(byPartialLinkText(partialLinkText))
        text != null -> this.find(byText(text))
        textContains != null -> this.find(withText(textContains))
        title != null -> this.find(byTitle(title))
        value != null -> this.find(byValue(value))
        else -> throw IllegalArgumentException("Incorrect selector parameters")
    }
}

/**
 * Creates Selenide element with the passed selector.
 */
fun SelenideDriver.elt(
    @Language("JQuery-CSS") css: String? = null,
    @Language("XPath") xpath: String? = null,
    @Language("selenium-id") id: String? = null,
    @Language("selenium-name") name: String? = null,
    @Language("selenium-class") cssClass: String? = null,
    @Language("selenium-html-tag") tag: String? = null,
    linkText: String? = null,
    partialLinkText: String? = null,
    text: String? = null,
    textContains: String? = null,
    title: String? = null,
    value: String? = null
): SelenideElement {
    return when {
        css != null -> this.find(css)
        xpath != null -> this.find(byXpath(xpath))
        id != null -> this.find(byId(id))
        name != null -> this.find(byName(name))
        cssClass != null -> this.find(byClassName(cssClass))
        tag != null -> this.find(byTagName(tag))
        linkText != null -> this.find(byLinkText(linkText))
        partialLinkText != null -> this.find(byPartialLinkText(partialLinkText))
        text != null -> this.find(byText(text))
        textContains != null -> this.find(withText(textContains))
        title != null -> this.find(byTitle(title))
        value != null -> this.find(byValue(value))
        else -> throw IllegalArgumentException("Incorrect selector parameters")
    }
}

/**
 * Creates Selenide elements collection with the passed selector.
 */
fun elts(
    @Language("JQuery-CSS") css: String? = null,
    @Language("XPath") xpath: String? = null,
    @Language("selenium-id") id: String? = null,
    @Language("selenium-name") name: String? = null,
    @Language("selenium-class") cssClass: String? = null,
    @Language("selenium-html-tag") tag: String? = null,
    linkText: String? = null,
    partialLinkText: String? = null,
    text: String? = null,
    textContains: String? = null,
    title: String? = null,
    value: String? = null
): ElementsCollection {
    return when {
        css != null -> Selenide.elements(css)
        xpath != null -> Selenide.elements(byXpath(xpath))
        id != null -> Selenide.elements(byId(id))
        name != null -> Selenide.elements(byName(name))
        cssClass != null -> Selenide.elements(byClassName(cssClass))
        tag != null -> Selenide.elements(byTagName(tag))
        linkText != null -> Selenide.elements(byLinkText(linkText))
        partialLinkText != null -> Selenide.elements(byPartialLinkText(partialLinkText))
        text != null -> Selenide.elements(byText(text))
        textContains != null -> Selenide.elements(withText(textContains))
        title != null -> Selenide.elements(byTitle(title))
        value != null -> Selenide.elements(byValue(value))
        else -> throw IllegalArgumentException("Incorrect selector parameters")
    }
}

/**
 * Creates Selenide elements collection with the passed selector.
 */
fun SelenideElement.elts(
    @Language("JQuery-CSS") css: String? = null,
    @Language("XPath") xpath: String? = null,
    @Language("selenium-id") id: String? = null,
    @Language("selenium-name") name: String? = null,
    @Language("selenium-class") cssClass: String? = null,
    @Language("selenium-html-tag") tag: String? = null,
    linkText: String? = null,
    partialLinkText: String? = null,
    text: String? = null,
    textContains: String? = null,
    title: String? = null,
    value: String? = null
): ElementsCollection {
    return when {
        css != null -> this.findAll(css)
        xpath != null -> this.findAll(byXpath(xpath))
        id != null -> this.findAll(byId(id))
        name != null -> this.findAll(byName(name))
        cssClass != null -> this.findAll(byClassName(cssClass))
        tag != null -> this.findAll(byTagName(tag))
        linkText != null -> this.findAll(byLinkText(linkText))
        partialLinkText != null -> this.findAll(byPartialLinkText(partialLinkText))
        text != null -> this.findAll(byText(text))
        textContains != null -> this.findAll(withText(textContains))
        title != null -> this.findAll(byTitle(title))
        value != null -> this.findAll(byValue(value))
        else -> throw IllegalArgumentException("Incorrect selector parameters")
    }
}

/**
 * Creates Selenide elements collection with the passed selector.
 */
fun SelenideDriver.elts(
    @Language("JQuery-CSS") css: String? = null,
    @Language("XPath") xpath: String? = null,
    @Language("selenium-id") id: String? = null,
    @Language("selenium-name") name: String? = null,
    @Language("selenium-class") cssClass: String? = null,
    @Language("selenium-html-tag") tag: String? = null,
    linkText: String? = null,
    partialLinkText: String? = null,
    text: String? = null,
    textContains: String? = null,
    title: String? = null,
    value: String? = null
): ElementsCollection {
    return when {
        css != null -> this.findAll(byCssSelector(css))
        xpath != null -> this.findAll(byXpath(xpath))
        id != null -> this.findAll(byId(id))
        name != null -> this.findAll(byName(name))
        cssClass != null -> this.findAll(byClassName(cssClass))
        tag != null -> this.findAll(byTagName(tag))
        linkText != null -> this.findAll(byLinkText(linkText))
        partialLinkText != null -> this.findAll(byPartialLinkText(partialLinkText))
        text != null -> this.findAll(byText(text))
        textContains != null -> this.findAll(withText(textContains))
        title != null -> this.findAll(byTitle(title))
        value != null -> this.findAll(byValue(value))
        else -> throw IllegalArgumentException("Incorrect selector parameters")
    }
}