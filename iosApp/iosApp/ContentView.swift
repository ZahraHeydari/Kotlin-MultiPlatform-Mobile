import SwiftUI
import shared

struct ContentView: View {

    @StateObject
    var iOSEmojiHubViewModel = IOSEmojiHubViewModel()

	var body: some View {
	    Text(String("EmojiHub"))
        List {
            ForEach(iOSEmojiHubViewModel.items, id: \.self) { item in
                Item(emojiItem: item)
            }
        }
	}
}

struct Item: View {
    var emojiItem: EmojiItem

    var body: some View {
        VStack(alignment: .leading) {
            Text(String("Name: " + emojiItem.name))
            Text(String("Group: " + emojiItem.group))
            Text(String("Category: " + emojiItem.category))
            Text(emojiItem.htmlCode[0].htmlToString())
        }.padding()
    }
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}

extension String {
    func htmlToString() -> String {
        return  try! NSAttributedString(data: self.data(using: .utf8)!,
                                        options: [.documentType: NSAttributedString.DocumentType.html],
                                        documentAttributes: nil).string
    }
}
