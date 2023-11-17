//
//  IOSEmojiHubViewModel.swift
//  iosApp
//
//  Created by zara on 11/10/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import shared
import KMPNativeCoroutinesAsync

@MainActor
class IOSEmojiHubViewModel: ObservableObject {

    private let emojiHubViewModel = EmojiHubViewModelHelper()

    @Published
    var items = Array<EmojiItem>()

    var task: Task<(), Never>? = nil

    init() {
        task = Task {
            do {
                let asyncItems = asyncSequence(for: emojiHubViewModel.itemsFlow)
                for try await asyncItem in asyncItems {
                    items = asyncItem
                }
            } catch {
                print("Failed with error: \(error)")
            }
        }
    }

    func clear() {
        task?.cancel()
    }
}
