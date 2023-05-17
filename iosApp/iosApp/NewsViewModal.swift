//
//  NewsViewModal.swift
//  iosApp


import Foundation
import shared
import SwiftUI

class NewsViewModal : ObservableObject, INewsView {

    @Published var items: [NewsItem] = [NewsItem]()

    func setupData(data: NewsList) {
        self.items = data.articles ?? [NewsItem]()
    }

    private lazy var presenter: INewsPresenter = {
        let presenter = NewsPresenter()
        presenter.attach(view: self)
        return presenter
    }()

    func loadData() {
        self.presenter.loadNews()
    }
}


